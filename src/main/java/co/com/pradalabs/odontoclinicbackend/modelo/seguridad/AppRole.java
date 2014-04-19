package co.com.pradalabs.odontoclinicbackend.modelo.seguridad;

import org.springframework.security.core.GrantedAuthority;

public enum AppRole implements GrantedAuthority {
    ADMIN (0),
    NEW_USER (1),
    USER (2),
    ADMINAPP(3),
    PROFESIONAL(4);

    private int bit;

    AppRole(int bit) {
        this.bit = bit;
    }

    public String getAuthority() {
        return toString();
    }

	public int getBit() {
		
		return bit;
	}

	public void setBit(int bit) {
		this.bit = bit;
	}
	
}