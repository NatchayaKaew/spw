package f2.spw;

import java.awt.Color;
import java.awt.Graphics2D;

public class SpaceShip extends Sprite{

  int step = 8;
  Color c; 
  
  public SpaceShip(int x, int y, int width, int height, Color c) {
    super(x, y, width, height);
    this.c = c;
  }

  @Override
  public void draw(Graphics2D g) {
    g.setColor(c);
    g.fillRect(x, y, width, height);
    
  }

  public void move(int direction){
    x += (step * direction);
    if(x < 0)
      x = 0;
    if(x > 400 - width)
      x = 400 - width;
  }

}