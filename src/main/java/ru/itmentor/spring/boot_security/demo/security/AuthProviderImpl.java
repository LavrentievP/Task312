package ru.itmentor.spring.boot_security.demo.security;

import org.springframework.stereotype.Component;

@Component
public class AuthProviderImpl
//        implements AuthenticationProvider
{

//    private final MyUserDetailsServise myUserDetailsServise;
//
//    @Autowired
//    public AuthProviderImpl(MyUserDetailsServise myUserDetailsServise) {
//        this.myUserDetailsServise = myUserDetailsServise;
//    }
//
//    @Override
//    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
//        String username = authentication.getName();
//
//       UserDetails personDetails = myUserDetailsServise.loadUserByUsername(username);
//       String password = authentication.getCredentials().toString();
//      if(! password.equals(personDetails.getPassword()))
//throw new BadCredentialsException("Bad credentials");
//
//      return new UsernamePasswordAuthenticationToken(personDetails, password, Collections.emptyList());
//    }
//
//    @Override
//    public boolean supports(Class<?> authentication) {
//        return true;
//    }
}
