package dasensio.springboot.domain;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

import org.hibernate.envers.Audited;
import org.springframework.data.jpa.domain.AbstractPersistable;

@Entity
@Audited
public class Explotacion extends AbstractPersistable<Long> {

	private static final long serialVersionUID = 3257643583706859864L;

	private String cea;
	private String direccion;
	private String propietario;

	@OneToMany(mappedBy = "explotacion")
	private Set<Animal> animales;

	public String getCea() {
		return cea;
	}

	public void setCea(final String cea) {
		this.cea = cea;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(final String direccion) {
		this.direccion = direccion;
	}

	public String getPropietario() {
		return propietario;
	}

	public void setPropietario(final String propietario) {
		this.propietario = propietario;
	}

	public Set<Animal> getAnimales() {
		return animales;
	}

	public void setAnimales(final Set<Animal> animales) {
		this.animales = animales;
	}

}
