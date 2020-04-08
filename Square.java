import javax.swing.*;

public class Square extends JButton {

    /**
     * instance variable to store the verticle position of a square on the grid in board
     */
    private int offsetX;
    /**
     * instance variable to store the horizontal position of a square on the grid in board
     */
    private int offsetY;
    /**
     * instance variable used to store an int which correspends to a specific ImageIcon
    **/
    private int iconNumber;

    /** variables to store the required ImageIcons to be assigned to each square
     **/
    ImageIcon water = new ImageIcon("Water.png");
    ImageIcon lilyPad = new ImageIcon("LilyPad.png");
    ImageIcon greenFrog = new ImageIcon("GreenFrog.png");
    ImageIcon greenFrog2 = new ImageIcon("GreenFrog2.png");
    ImageIcon redFrog = new ImageIcon("RedFrog.png");
    ImageIcon redFrog2 = new ImageIcon("RedFrog2.png");

    /**
     * accessor method to allow the instance variable offsetX to be returned
     * @return offsetX representing the row in which the given square is found in the grid layout of board
     **/
    public int getoffsetX() {
        return offsetX;
    }

    /**
     * accessor method to allow the instance variable offsetY to be returned
     * @return offsetY representing the column in which the given square is found in the grid layout of board
     **/
    public int getoffsetY() {
        return offsetY;
    }

    /**
     * accessor method allowing the variable iconNumber to be returned
     * @return iconNumber representing which icon is to be diplayed
     **/
    public int getIconNumber() {
        return iconNumber;
    }

    /**
     * method to set the iconNumber to 0 if water ImageIcon should be displayed 
     **/
    private void setWaterNumber()
    {
        iconNumber = 0;
    }
    /**
     * method to set the iconNumber to 1 if lilyPad ImageIcon should be displayed 
     **/
    private void setLilyPadNumber()
    {
        iconNumber = 1;
    }
    /**
     * method to set the iconNumber to 2 if greenFrog ImageIcon should be displayed 
     **/
    private void setGreenFrogNumber()
    {
        iconNumber = 2;
    }
    /**
     * method to set the iconNumber to 3 if redFrog ImageIcon should be displayed 
     **/
    private void setRedFrogNumber()
    {
        iconNumber = 3;
    }

    /**
     * method which sets the ImageIcon of the square dependent on which iconNumber is stored 
     **/
    private void setSquareIcon()
    {
        if(iconNumber == 0)
        {
            setIcon(water);
        }
        else if(iconNumber == 1)
        {
            setIcon(lilyPad);
        }
        else if(iconNumber == 2)
        {
            setIcon(greenFrog);
        }
        else if(iconNumber == 3)
        {
            setIcon(redFrog);
        }
        else if(iconNumber == 4)
        {
            setIcon(greenFrog2);
        }
    }

    /**
     * method used to set the ImageIcons of the first row of squares of the Board matching the given board layout.
     * Any square with no specific ImageIcon is set to display the water icon 
     **/
    private void setFirstLine()
    {
        if (offsetY % 2 == 0) 
        {
            setLilyPadNumber();
        }
        else
        {
            setWaterNumber();
        }
    }

    /**
     * method used to set the ImageIcons of the second row of squares of the Board matching the given board layout.
     * Any square with no specific ImageIcon is set to display the water icon 
     **/
    private void setSecondLine()
    {
        if(offsetY % 2 != 0)
        {
            setGreenFrogNumber();
        }
        else
        {
            setWaterNumber();
        }
    }

    /**
     * method used to set the ImageIcons of the third row of squares of the Board matching the given board layout.
     * Any square with no specific ImageIcon is set to display the water icon 
     **/
    private void setThirdLine()
    {
        if(offsetY % 2 == 0)
        {
            if(offsetY == 2)
            {
                setGreenFrogNumber();
            }
            else
            {
                setLilyPadNumber();
            }
        }
        else
        {
            setWaterNumber();
        }
    }

    /**
     * method used to set the ImageIcons of the forth row of squares of the Board matching the given board layout.
     * Any square with no specific ImageIcon is set to display the water icon.
     **/
    private void setForthLine()
    {
        if(offsetY % 2 != 0)
        {
            setLilyPadNumber();
        }
        else
        {
            setWaterNumber();
        }
    }

    /**
     * method used to set the ImageIcons of the fifth row of squares of the Board matching the given board layout.
     * Any square with no specific ImageIcon is set to display the water icon.
     **/
    private void setFifthLine()
    {
        if(offsetY % 2 == 0)
        {
            if(offsetY == 2)
            {
                setRedFrogNumber();
            }
            else
            {
                setGreenFrogNumber();
            }
        }
        else
        {
            setWaterNumber();
        }
    }

    /**
     * Constructor method for a square which calls appropriate functions to set ImageIcons, based on offsetX.
     * @param accepts two integers from the two for loops in Board and sets them equal to the offsetX and offsetY
     * instance variables. These represent the position of the square in the 5 x 5 grid in Board
     **/
    public Square(int x, int y) 
    {
        offsetX = x;
        offsetY = y;
        
        
        if (offsetX == 0) 
        {
            setFirstLine();
        }
        else if(offsetX == 1)
        {
            setSecondLine();
        }
        else if(offsetX == 2)
        {
            setThirdLine();
        }
        else if(offsetX == 3)
        {
            setForthLine();
        }
        else if(offsetX == 4)
        {
            setFifthLine();
        }
        setSquareIcon();
    }
}