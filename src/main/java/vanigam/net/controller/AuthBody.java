package vanigam.net.controller;

import lombok.Data;

/** Created by vyn on 09-Apr-2020 */

public @Data class AuthBody {

	private Long mobileNumber;
	private String email;
	private String password;

}
