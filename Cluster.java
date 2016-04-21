import java.util.ArrayList;

public class Cluster {

	public ArrayList<WebService> ws;
	public int id;
	
	public Cluster(int id){
		this.id = id;
		ws = new ArrayList<WebService>();
	}
	
	public ArrayList<WebService> getWebServices(){
		return this.ws;
	}
	
	public void addWS(WebService wSer){
		ws.add(wSer);
	}
	
	public int getID(){
		return this.id;
	}
	
	public void printCluster(){
		for(int i=0;i<ws.size();i++){
			System.out.print(ws.get(i).fileName+", ");
		}
	}
}
