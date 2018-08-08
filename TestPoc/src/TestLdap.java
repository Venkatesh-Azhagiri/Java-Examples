
import java.util.List;

import javax.naming.NamingEnumeration;
import javax.naming.NamingException;
import javax.naming.directory.Attributes;

import org.springframework.ldap.core.AttributesMapper;
import org.springframework.ldap.core.LdapTemplate;
import org.springframework.ldap.core.support.LdapContextSource;
import org.springframework.security.ldap.SpringSecurityAuthenticationSource;


public class TestLdap {

	/**
	 * @param args
	 */
	static LdapTemplate ldapTemplate = null;
	public static void main(String[] args) {
		System.out.println("test");
		if (!loginLDAP("", "")){
			System.out.println("false");
		} else {
			System.out.println("true");
		}
	
	}
	public static boolean loginLDAP (String userId, String applicationId) {
		String password = "";
		if (getLdapTemplate(applicationId) == null) return false;
		
		if (!(ldapTemplate.authenticate("", "(uid=" + userId + ")", password))){
			System.out.println("authenticate block***");
			return false;
		}
		return true;
	}

	public static LdapTemplate getLdapTemplate(String applicationId) {
		System.out.println("test1****"+ldapTemplate);
		if (ldapTemplate == null) {
			try {
				
				String uri = "";
				String base = "";
				System.out.println("inside *** try45");				
				LdapContextSource contextSource = new LdapContextSource(); // note: reading LDAP address from conf file can be a minimal threat, but taking that risk for now.				
				
				//System.out.println("level 1");
				contextSource.setUrl(uri);
				contextSource.setBase(base);
				//System.out.println("inside *** try1");
				contextSource.setAuthenticationSource(new SpringSecurityAuthenticationSource());
				contextSource.afterPropertiesSet();
				//System.out.println("inside *** try2");
				ldapTemplate = new LdapTemplate(contextSource);
				getDepartment("", "");
				
			} catch (Exception e) {
				System.out.println("exception***"+e);
				return null;
			}
		}
		return ldapTemplate;
	}
	
	private static String getDepartment(String userId, String applicationId) {
		AttributesMapper mapper = new AttributesMapper() {
			@Override
			public String mapFromAttributes(Attributes attrs) throws NamingException {
				NamingEnumeration<String> namingEnumeration = attrs.getIDs();
				while (namingEnumeration.hasMore()) {
					System.out.println(namingEnumeration.next());
				}
				return attrs.get("").get().toString();
			}
		};
		String department = "";

		@SuppressWarnings("unchecked")
		List<String> person = ldapTemplate.search("", "(uid=" + userId + ")", mapper); 
		if (person.size() != 1)
			return department;
		department = person.get(0);

		if (department == null || department.length() <= 0)
			return department;
		return department;
	}

}
