package com.javarush.test.level15.lesson12.home05;

/**
 * Created by WWW on 21.05.2016.
 */
public class SubSolution extends Solution
{
    public SubSolution()
    {
    }

    SubSolution(String s, int i, int j)
    {
        super(s, i, j);
    }

    SubSolution(String s, int i, String s1)
    {
        super(s, i, s1);
    }

    SubSolution(String s2, String s, int i)
    {
        super(s2, s, i);
    }

    public SubSolution(String s)
    {
        super(s);
    }

    public SubSolution(String s, String s1)
    {
        super(s, s1);
    }

    protected SubSolution(int i)
    {
        super(i);
    }

    protected SubSolution(int i, int j, int x)
    {
        super(i, j, x);
    }

    protected SubSolution(int i, int s)
    {
        super(i, s);
    }

    private SubSolution(Boolean s){
        super();
    }
    private SubSolution(Boolean s, Boolean s1){
        super();
    }
    private SubSolution(Boolean s, Boolean s2, Boolean s3){
        super();
    }
}
