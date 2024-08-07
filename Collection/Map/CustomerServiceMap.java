package Collection.Map;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CustomerServiceMap {
    static HashMap<String, Map<String, Integer>> map;
    
    public static void main(String[] args) {
        map = new HashMap<>();
        map.put("1", new HashMap<>());
        map.get("1").put("Prepaid Service", 20);
        map.get("1").put("Postpaid Service", 40);
        map.put("2", new HashMap<>());
        map.get("2").put("Prepaid Service", 50);
        map.get("2").put("Postpaid Service", 70);
        map.put("3", new HashMap<>());
        map.get("3").put("Prepaid Service", 80);
        map.get("3").put("Postpaid Service", 90);
        System.out.println(getTotalusageForACustomer("3"));
        getAllCustomerUsageDetails();
        updateServiceUsage("1", "Prepaid Service", 40);
    }

    private static void updateServiceUsage(String cid, String service, int usage) {
        map.get(cid).put(service, usage);
    }

    private static void getAllCustomerUsageDetails() {
       System.out.println(map.entrySet());
    }

    private static int getTotalusageForACustomer(String i) {
        Collection<Integer> usages = map.get(i).values();
        return usages.stream().mapToInt(Integer::intValue).sum();
    }
}
