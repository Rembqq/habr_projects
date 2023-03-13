package OOP_Basics;

    // Task 2_0
public class Vector {
    // Constructor
    public Vector(double _x, double _y, double _z)
    {
        x = _x;
        y = _y;
        z = _z;
    }
    // Methods
    //
    // Length
    public double length()
    {
        return Math.sqrt(x * x + y * y + z * z );
    }

    // Scalar multiplication
    public double scalar_prod(Vector vec)
    {
        return x * vec.x + y * vec.y + z * vec.z;
    }

    // Vector multiplication
    public Vector cross_prod(Vector vec)
    {
        double ex, ey, ez;
        ex = y * vec.z - z * vec.y;
        ey = z * vec.x - x * vec.z;
        ez = x * vec.y - y * vec.x;
        return new Vector(ex, ey, ez);
    }

    // Angle between vectors
    public double angle_between_vectors(Vector vec)
    {
        double angle = Math.acos(scalar_prod(vec) / length() * vec.length());
        return angle;
    }

    // Addition
    public Vector add(Vector vec)
    {
        return new Vector(x + vec.x, y + vec.y, z + vec.z);
    }

    //Subtraction
    public Vector subtract(Vector vec)
    {
        return new Vector(x - vec.x, y - vec.y, z - vec.z);
    }

    // Random Vector Array
    public static Vector[] random_array(int n)
    {
        Vector[] r_arr = new Vector[n];
        for(int i = 0; i < r_arr.length; ++i)
        {
            r_arr[i] = new Vector(Math.round(Math.random() * 5), Math.round(Math.random() * 5),
                    Math.round(Math.random() * 5));
        }
        return r_arr;
    }

    @Override
    public String toString()
    {
        return "Vector{" +
                "x = "+ x +
                ", y = " + y +
                ", z = " + z + "}";
    }

    // Private fields
    private double x;
    private double y;
    private double z;
};
