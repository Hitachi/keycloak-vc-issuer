package org.fiware.keycloak.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;
import java.util.Objects;
import java.util.Set;

@Builder(builderClassName = "VCClaimsBuilder")
@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class VCClaims {
	private String firstName;
	private String familyName;
	private String email;
	private Set<Role> roles;

	private Map<String, String> additionalClaims;

	@JsonAnyGetter
	public Map<String, String> getAdditionalClaims() {
		return additionalClaims;
	}

    public static class VCClaimsBuilder {
        private String firstName;
        private String familyName;
        private String email;
        private Set<Role> roles;
        private Map<String, String> additionalClaims;

        public VCClaimsBuilder firstName(String firstName) {
            if (Objects.nonNull(firstName)) {
                this.firstName = firstName;
            }
            return this;
        }

        public VCClaimsBuilder familyName(String familyName) {
            if (Objects.nonNull(familyName)) {
                this.familyName = familyName;
            }
            return this;
        }

        public VCClaimsBuilder email(String email) {
            if (Objects.nonNull(email)) {
                this.email = email;
            }
            return this;
        }

        public VCClaimsBuilder roles(Set<Role> roles) {
            if (Objects.nonNull(roles)) {
                this.roles = roles;
            }
            return this;
        }

        public VCClaimsBuilder additionalClaims(Map<String, String> additionalClaims) {
            if (Objects.nonNull(additionalClaims)) {
                this.additionalClaims = additionalClaims;
            }
            return this;
        }

        public VCClaims build() {
            VCClaims vcClaims = new VCClaims();
            vcClaims.firstName = this.firstName;
            vcClaims.familyName = this.familyName;
            vcClaims.email = this.email;
            vcClaims.roles = this.roles;
            vcClaims.additionalClaims = this.additionalClaims;
            return vcClaims;
        }
    }
}
