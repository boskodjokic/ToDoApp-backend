package com.bosko.rest.webservices.restwebservices.jwt;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class JwtInMemoryUserDetailsService implements UserDetailsService {

	static List<JwtUserDetails> inMemoryUserList = new ArrayList<>();

	static {
		inMemoryUserList.add(new JwtUserDetails(1L, "bosko",
				"$2y$12$gFg3VknYpEIlgKd1XptIe.NleWYDJql7qLDVk/RSSdhhGai3.8uCW", "ROLE_USER_2"));
		inMemoryUserList.add(new JwtUserDetails(2L, "john",
				"$2y$12$2i5JMkC0AR.HSxEFEhS2vus1lxyLAVfdtmRnYzkzaFB796EgoF5Qm", "ROLE_USER_2"));

	}

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Optional<JwtUserDetails> findFirst = inMemoryUserList.stream()
				.filter(user -> user.getUsername().equals(username)).findFirst();

		if (!findFirst.isPresent()) {
			throw new UsernameNotFoundException(String.format("USER_NOT_FOUND '%s'.", username));
		}

		return findFirst.get();
	}

}