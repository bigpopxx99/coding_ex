import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class GetImportance {

	// 递归实现，时间较慢
	// public static int getImportance(List<Employee> employees, int id) {
	// int ret = 0;
	// for (int i=0; i<employees.size(); i++) {
	// if (employees.get(i).id == id) {
	// ret += employees.get(i).importance;
	// List<Integer> subids = employees.get(i).subordinates;
	// if (subids != null && subids.size() > 0) {
	// for (int l=0; l<subids.size(); l++) {
	// ret += getImportance(employees, subids.get(l));
	// }
	// }
	// }
	// }
	// return ret;
	// }
	// 迭代
	public static int getImportance(List<Employee> employees, int id) {
		int ret = 0;
		HashSet<Integer> waitSet = new HashSet<>();
		waitSet.add(id);
		ArrayList<Employee> waitList = new ArrayList<>(employees);
		while (waitSet.size() > 0) {
			HashSet<Integer> tmpSet = new HashSet<>();
			ArrayList<Employee> tmpList = new ArrayList<>();
			for (int i = 0; i < waitList.size(); i++) {
				if (waitSet.contains(waitList.get(i).id)) {
					ret += waitList.get(i).importance;
					tmpList.remove(i);
					if (waitList.get(i).subordinates != null && waitList.get(i).subordinates.size() > 0) {
						List<Integer> subList = waitList.get(i).subordinates;
						for (int j = 0; j < subList.size(); j++) {
							tmpSet.add(subList.get(j));
						}
					}
				}
			}
			waitSet = tmpSet;
			waitList = tmpList;
		}
		return ret;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee t1 = new Employee();
		Employee t2 = new Employee();
		Employee t3 = new Employee();
		Employee t4 = new Employee();

		t1.id = 1;
		t1.importance = 5;
		ArrayList<Integer> list = new ArrayList<>();
		list.add(2);
		list.add(3);
		t1.subordinates = list;

		t2.id = 2;
		t2.importance = 3;
		ArrayList<Integer> list2 = new ArrayList<>();
		list2.add(4);
		t2.subordinates = list2;

		t3.id = 3;
		t3.importance = 4;

		t4.id = 4;
		t4.importance = 1;

		ArrayList<Employee> param1 = new ArrayList<>();
		param1.add(t1);
		param1.add(t2);
		param1.add(t3);
		param1.add(t4);

		System.out.println(getImportance(param1, 1));
	}

}

// Employee info
class Employee {
	// It's the unique id of each node;
	// unique id of this employee
	public int id;
	// the importance value of this employee
	public int importance;
	// the id of direct subordinates
	public List<Integer> subordinates;
};
