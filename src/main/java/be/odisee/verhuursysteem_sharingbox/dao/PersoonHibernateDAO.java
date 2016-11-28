package be.odisee.verhuursysteem_sharingbox.dao;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import be.odisee.verhuursysteem_sharingbox.domain.Persoon;

@Repository("PersoonDAO")
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class PersoonHibernateDAO extends HibernateDao implements PersoonDAO {

	 public Persoon savePersoon(int id, String status, String voornaam, String familienaam, String emailadres, String paswoord) {
	        Persoon persoon = new Persoon(id, status, voornaam, familienaam, emailadres, paswoord);
	        sessionSaveObject(persoon);
	        return persoon;
	    }

	    public Persoon savePersoon(String status, String voornaam, String familienaam, String emailadres, String paswoord) {
	        Persoon persoon = new Persoon(status, voornaam, familienaam, emailadres, paswoord);
	        sessionSaveObject(persoon);
	        return persoon;
	    }

	    public Persoon getPersoonById(int persoonId) {
	        return (Persoon) sessionGetObjectById("Persoon", persoonId);
	    }

	    @Override
	    public Persoon getPersoonByEmailadres(String emailadres) {
	        return (Persoon) sessionGetObjectByStringParameterValue("Persoon", "emailadres", emailadres);
	    }

	    public List<Persoon> getAllPersons() {
	        return (List<Persoon>) sessionGetAllObjects("Persoon");
	    }

	    public Persoon updatePersoon(Persoon persoon) {
	        sessionUpdateObject(persoon);
	        return persoon;
	    }
	    

}
