package co.edu.sena.vitaweb.persistencia;

import co.edu.sena.vitaweb.logica.Afiliado;
import co.edu.sena.vitaweb.persistencia.exceptions.NonexistentEntityException;
import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.Persistence;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

/**
 *
 * @author avill
 */
public class AfiliadoJpaController implements Serializable {

    public AfiliadoJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    
    public AfiliadoJpaController() {
        emf = Persistence.createEntityManagerFactory("co.edu.sena_VitaWeb_PU");
    }
    
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Afiliado afiliado) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(afiliado);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Afiliado afiliado) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            afiliado = em.merge(afiliado);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                int id = afiliado.getId();
                if (findAfiliado(id) == null) {
                    throw new NonexistentEntityException("The afiliado with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(int id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Afiliado afiliado;
            try {
                afiliado = em.getReference(Afiliado.class, id);
                afiliado.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The afiliado with id " + id + " no longer exists.", enfe);
            }
            em.remove(afiliado);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Afiliado> findAfiliadoEntities() {
        return findAfiliadoEntities(true, -1, -1);
    }

    public List<Afiliado> findAfiliadoEntities(int maxResults, int firstResult) {
        return findAfiliadoEntities(false, maxResults, firstResult);
    }

    private List<Afiliado> findAfiliadoEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Afiliado.class));
            Query q = em.createQuery(cq);
            if (!all) {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();
        } finally {
            em.close();
        }
    }

    public Afiliado findAfiliado(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Afiliado.class, id);
        } finally {
            em.close();
        }
    }

    public int getAfiliadoCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Afiliado> rt = cq.from(Afiliado.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
