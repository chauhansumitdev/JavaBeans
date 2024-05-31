import java.io.Serializable;

// set of standards and specifiations for developing enterprise ready applications

// java bean  -- reusable class

// java bean is a java class that follows three properties
// getter and setter
// implement serializable
// default constructor

class Bean implements Serializable{
    private String name;
    private int id;

    public Bean(){

    }
    
    public String getName(){
        return name;
    }

    public int getId(){
        return id;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setId(int id){
        this.id = id;
    }
}