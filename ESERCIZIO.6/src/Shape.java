public class Shape {
    private String shapeName;
    private int numberOfEdges;

    public Shape(){
        System.out.println("New shape");
        shapeName = "undefined shape";
    }

    public Shape(double radius){  // appunti: overload 2o+ funzioni uguali con parametri diversi
        shapeName = "circle";
        System.out.println("New cicle is born");
    }
    public Shape(double edgeLength, int edge){
        shapeName = "square";
        numberOfEdges = edge; // non è obbligatorio this perché ho assegnato a edge un nome diverso
        System.out.println("New square is born");
    }
    public Shape(double e1, double e2, int edge){ // e1 e2 non usati ma servono per entrare in questo costruttore
        shapeName = "rectangle";
        numberOfEdges = edge;
        System.out.println("New rectangle is born");
    }

    public Shape(double e1, double e2, double e3, int edge){
        shapeName = "triangle";
        numberOfEdges = edge;
        System.out.println("New triangle is born");
    }

    public String getShapeDetails(){
        return "Shape name: " + shapeName + "\nnumber of edges: " + numberOfEdges; //VAI A CAPO \n
    }

}
/* control maiusc / sopra otto
define a class called Shape that has:
an instance variable shapeName
an instance variable numberOfEdges
1 basic constructor method with no params that
informs the user about the Shape object creation
assign Undefined shape to the object's shapeName
4 params overload constructor methods:
for circle:
takes a double radius param
informs the user about the object creation
assigns the shapeName
for square
takes an int edges param and a double edgeLength param
informs the user about the object creation
assigns the values to numberOfEdges and to shapeName
for rectangle:
takes an int edges param and 2 double (e1, e2) params
informs the user about the object creation
assigns the values to numberOfEdges and to shapeName
for triangle:
takes an int edges param and 3 double (e1, e2, e3) params
informs the user about the object creation
assigns the values to numberOfEdges and to shapeName
a method called getShapeDetails() that returns an informative String containing:
shapeName
numberOfEdges
define a testing class where you:
create the 5 Shape objects using all the different constructor invocations
invoke getShapeDetails() for each Shape object and assign the returned values to dedicated String variables
print in console the values of the 5 dedicated String variables */
