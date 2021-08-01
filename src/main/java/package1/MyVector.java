/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package package1;

/**
 *
 * @author oscar
 */
public class MyVector 
{
    private double vectors [];//Declaration of the array that will hold the vector.
    
    public MyVector(double [] initvalues)
    {
        vectors=initvalues;
    }//Constructor
    
    public MyVector(MyVector myVector)
    {
        this.vectors=myVector.vectors;
    }//Copy constructor
    
    public int size()
    {
        return vectors.length;
    }//size method. Returns size of array
    
    public double get(int index)
    {
        return (double)vectors[index];
    }//get method. Returns element value as a double at a certain index.
    
    public MyVector plus(MyVector vector2)
    {
        MyVector vector1=new MyVector(this.vectors);
        
        if(vector1.size()==vector2.size())
        {
            int size=vector1.size();
            double vector3 []=new double[size];//Place holder for new vector
            
            for(int x=0;x<size;x++)
            {
               vector3[x]=vector1.get(x)+vector2.get(x); 
            }
            MyVector newVector=new MyVector(vector3);//Creating new vector
            return newVector;
        }
        else
        {
            throw new ArithmeticException("ERROR: Cannot add vectors of different dimensions.");//An exception is thrown if vectors of different dimensions are trying to be added.
        }
    }//plus method. Adds two vectors of equal dimensions together to create a new vector.
    
    public MyVector minus(MyVector vector2)
    {
        MyVector vector1=new MyVector(this.vectors);//Copy of the first vector
        
        if(vector1.size()==vector2.size())
        {
            int size=vector1.size();
            double vector3 []=new double[size];//Place holder for new vector
            
            for(int x=0;x<size;x++)
            {
               vector3[x]=vector1.get(x)-vector2.get(x); 
            }
            MyVector newVector=new MyVector(vector3);//Creating new vector
            return newVector;
        }
        else
        {
            throw new ArithmeticException("ERROR: Cannot subtract vectors of different dimensions.");//Throws exception if dimensions are not the same
        }  
    }//minus method. Subtracts two vectors of equal dimensions to create a new vector.
    
    public MyVector scaledBy(double multiplier)
    {
        MyVector vector1= new MyVector(this.vectors);
        double vectorHolder []=new double[vector1.size()];//Place holder for new vector
        int size=vector1.size();
        
        for(int x=0;x<size;x++)
        {
            vectorHolder[x]=vector1.get(x)*multiplier;
        }
        
        MyVector newVector=new MyVector(vectorHolder);//Creating new vector
        return newVector;
    }//scaledBy method. Multiplies each element in a vector by the multiplier and returns a new vector.
    
    public double dot(MyVector vector2)
    {
        double total=0;
        
        MyVector vector1=new MyVector(vectors);//Copy of the first vector
        int size=vector1.size();
        
        if(vector1.size()==vector2.size())
        {
            for(int x=0;x<size;x++)
            {
                total+=vector1.get(x)*vector2.get(x);
            }
            return total;
        }
        else
        {
            throw new ArithmeticException("ERROR: Cannot multiply vectors of different dimensions.");//Exception is thrown if not the same dimension
        }
    }//dot method. Multiplies each element by eachother and adds them to a total. Only if both vectors are the same dimensions.
    
    public boolean equals(MyVector vector2)
    {
        MyVector vector1=new MyVector(vectors);
        
        if(vector1.size()==vector2.size())
        {
            int size=vector1.size();
            for(int x=0;x<size;x++)
            {
                if(vector1.get(x)==vector2.get(x))
                {
                    continue;
                }
                else
                {
                    return false;
                }
            }
            return true;
        }
        else
        {
            return false;
        }
    }//equals method. Compares two vectors and returns true if completely the same and false if not.
    
    public String toString()
    {
        int size=this.vectors.length;
        String output="Vector: ";
        for(int x=0;x<size;x++)
        {
            output+=vectors[x];
            if(x!=size-1)
            {
                output+=", ";
            }
        }
        return output;
    }//toString method. Sets vector to a string.
    
    public double abs()
    {
        MyVector vector1=new MyVector(vectors);
        
        double total=vector1.dot(vector1);
        
        return Math.sqrt(total);
    }//abs method. Takes the dot product of a vector and returns absolute value as a double.
}//MyVector class
