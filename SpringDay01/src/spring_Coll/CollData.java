package spring_Coll;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;


public class CollData {
	private String[] arrayData;
	private List<String> listData;
	private Set<String> setData;
	private Map<String, String>   mapData;
	private Properties propsData;
	public String[] getArrayData() {
		return arrayData;
	}
	public void setArrayData(String[] arrayData) {
		this.arrayData = arrayData;
	}
	public List getListData() {
		return listData;
	}
	public void setListData(List listData) {
		this.listData = listData;
	}
	public Set getSetData() {
		return setData;
	}
	public void setSetData(Set setData) {
		this.setData = setData;
	}
	public Map<String, String> getMapData() {
		return mapData;
	}
	public void setMapData(Map<String, String> mapData) {
		this.mapData = mapData;
	}
	public Properties getPropsData() {
		return propsData;
	}
	public void setPropsData(Properties propsData) {
		this.propsData = propsData;
	}
	@Override
	public String toString() {
		return "CollData [\narrayData=" + Arrays.toString(arrayData) + ", \nlistData=" + listData + ", \nsetData=" + setData
				+ ", \nmapData=" + mapData + ", \npropsData=" + propsData + "\n]";
	}
	
}
