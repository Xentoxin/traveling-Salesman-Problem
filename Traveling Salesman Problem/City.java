import java.util.Random;

public class City {
private int XPOS, YPOS;
public boolean visited = false;
public City(){
	Random rand = new Random();
	this.XPOS = rand.nextInt(9);
	this.YPOS = rand.nextInt(9);
}
public int getX(){
	return this.XPOS;
}
public void setX(int n){
	this.XPOS = n;
}
public int getY(){
	return this.YPOS;
}
public void setY(int n){
	this.YPOS = n;
}
public boolean isVisited(){
	return visited;
}
public void setVisited(boolean n){
	this.visited = n;
}

}

//so i have an xy position for every city
//i can find the distance between each city
//have a list of cities
//randomly pick 
