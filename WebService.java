import java.util.*;
/**
 * 
 * @author Mohita
 *
 */
public class WebService {

	public ArrayList<String> content;
	ArrayList<String> messages;
	ArrayList<String> types;
	ArrayList<String> portTypes;
	ArrayList<String> serviceName;
	String fileName;
	
	private boolean isNoise = false;
	private boolean isVisited = false;
	private int clusterNumber;
	
	public boolean isVisited(){
		return this.isVisited;
	}
	
	public void setVisited(){
		this.isVisited = true;
	}
	public boolean isNoise(){
		return this.isNoise;
	}
	
	public void setNoise(){
		this.isNoise = true;
	}
	
	public int getClusterID(){
		return this.clusterNumber;
	}
	
	public void setClusterID(int clusterNumber){
		this.clusterNumber = clusterNumber;
	}
	
	public ArrayList<String> getContent() {
		return content;
	}
	public void setContent(ArrayList<String> content) {
		this.content = content;
	}
	public ArrayList<String> getMessages() {
		return messages;
	}
	public void setMessages(ArrayList<String> messages) {
		this.messages = messages;
	}
	public ArrayList<String> getTypes() {
		return types;
	}
	public void setTypes(ArrayList<String> types) {
		this.types = types;
	}
	public ArrayList<String> getPortTypes() {
		return portTypes;
	}
	public void setPortTypes(ArrayList<String> portTypes) {
		this.portTypes = portTypes;
	}
	public ArrayList<String> getServiceName() {
		return serviceName;
	}
	public void setServiceName(ArrayList<String> serviceName) {
		this.serviceName = serviceName;
	}
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	
}
