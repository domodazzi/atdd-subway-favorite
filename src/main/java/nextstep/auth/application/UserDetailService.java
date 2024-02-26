package nextstep.auth.application;

import nextstep.auth.domain.UserDetail;

public interface UserDetailService {

  UserDetail findByEmail(String email);

  UserDetail createUser(String email, String password, int age);
}
