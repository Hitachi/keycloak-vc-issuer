package org.fiware.keycloak.model;

import lombok.Getter;

public enum ErrorType {

	INVALID_REQUEST("invalid_request"),
	INVALID_TOKEN("invalid_token"),
	UNSUPPORTED_CREDENTIAL_TYPE("unsupported_credential_type"),
	UNSUPPORTED_CREDENTIAL_FORMAT("unsupported_credential_format"),
    NOT_ALLOWED_CREDENTIAL_TYPE("not_allowed_credential_type"),
    NOT_ALLOWED_CREDENTIAL_FORMAT("not_allowed_credential_format"),
	INVALID_OR_MISSING_PROOF("invalid_or_missing_proof");

	@Getter
	private final String value;

	ErrorType(String value) {
		this.value = value;
	}
}
