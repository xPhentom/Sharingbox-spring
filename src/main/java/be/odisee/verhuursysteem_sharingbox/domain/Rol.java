package be.odisee.verhuursysteem_sharingbox.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="rollen")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="type",discriminatorType=DiscriminatorType.STRING)
@DiscriminatorValue("Rol")
public abstract class Rol implements Serializable {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    protected int id;

    @Column
    protected String status;

    @Column
    protected String usernaam;

    @ManyToOne
    @JoinColumn(name="persoon_id")
    protected Persoon persoon;
    
    public Rol(){}

    public Rol(String status, String usernaam, Persoon persoon) {
        this.status = status;
        this.usernaam = usernaam;
        this.persoon = persoon;
    }

    public Rol(int id, String status, String usernaam, Persoon persoon) {
        this.id = id;
        this.status = status;
        this.usernaam = usernaam;
        this.persoon = persoon;
    }

    public int getId() {
        return id;
    }

      public String getUsernaam() {
        return usernaam;
    }

    public abstract String getType();
    

    public Persoon getPersoon() {
        return persoon;
    }

    public void setPersoon(Persoon persoon) {
        this.persoon = persoon;
    }

}

