import java.awt.RenderingHints.Key;
import java.awt.event.KeyListener;
import java.security.DomainCombiner;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.security.auth.kerberos.KerberosKey;

public class SubDomainVisits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] test1 = {"9001 discuss.leetcode.com"};
		String[] test2 = {"900 google.mail.com", "50 yahoo.com", "1 intel.mail.com", "5 wiki.org"};
		SolutionSubDomainVisits solutionSubDomainVisits  = new SolutionSubDomainVisits();
		System.out.println(solutionSubDomainVisits.subdomainVisits(test1));
		System.out.println(solutionSubDomainVisits.subdomainVisits(test2));

	}

}

class SolutionSubDomainVisits {
    public List<String> subdomainVisits(String[] cpdomains) {
    	List<String> retList = new ArrayList<>();
        if (cpdomains == null || cpdomains.length == 0) {
        	return retList;
        }
        HashMap<String, Integer> map = new HashMap<>();
        for (int i=0; i<cpdomains.length; i++) {
        	String[] ndList = cpdomains[i].split(" ");
        	if (ndList != null && ndList.length == 2) {
            	int number = Integer.parseInt(ndList[0]);
            	String domain = ndList[1];
            	String[] domainList = domain.split("\\.");
            	for (int j=0; j<domainList.length; j++) {
            		String one_domain = domainList[j];
            		for (int k=j+1; k<domainList.length; k++) {
            			one_domain += "." + domainList[k];
            		}
            		int one_num = number;
            		if (map.containsKey(one_domain)) {
            			one_num += map.get(one_domain);
            		}
            		map.put(one_domain, one_num);
            	}
        	}
        }
        for (String key : map.keySet()) {
        	retList.add(map.get(key) + " " + key);
        }
        return retList;
    }
}
