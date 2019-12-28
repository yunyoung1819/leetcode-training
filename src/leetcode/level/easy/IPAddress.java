package leetcode.level.easy;

/**
 * problem : 1108
 * title : Defanging an IP Address 
 * link : https://leetcode.com/problems/defanging-an-ip-address/
 * date : 2019.12.28
 * author : YUN YOUNG 
 * 
 * description : Given a valid (IPv4) IP address, return a defanged version of that IP address.
 * A defanged IP address replaces every period "." with "[.]".  
 *
 */
public class IPAddress {
	public String defangIPaddr(String address) {
		String newAddr = address.replace(".", "[.]");
		return newAddr;
	}
}
