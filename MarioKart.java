public class MarioKart extends VideoGame
{
  /* private String playerName;
   private String gameName;
   private String[] consoles;
   private int playerName;
   private String gameType;
   private int space;
   private boolean ai;
   private String music;
   private String controls;
   private String background;
   private String[] characters; */
   
   private String[] items;
   private int score;
   private String[] karts;
   private String gameMode;
   private int speedMode;
   private String driving;
   
   public MarioKart(String[] i, int s, String[] k, String g, int sp, String d)
   {
      super("Luigi", 12, "Bowser's Castle", "Mario Kart", new String[] {"Mario", "Luigi", "Peach", "Toad", "Yoshi", "Donkey Kong", "Wario", "Bowser"}, new String[] {"Nintendo 64", "Wii"}, "Driving", 4096, 4, true, "Yes");
      items = i;
      score = s;
      karts = k;
      gameMode = g;
      speedMode = sp;
      driving = d;
   }
   
   public String[] getItems()
   {
      return items;
   }
   
   public String[] getKarts()
   {
      return karts;
   }
   
   public int getScore()
   {
      return score;
   }
   
   public int getSpeedMode()
   {
      return speedMode;
   }
   
   public String getGameMode()
   {
      return gameMode;
   }
   
   public String getDriving()
   {
      return driving;
   }
   
   public void setItems(String[] o)
   {
      items = o.clone();    
   }
   
   public void setKarts(String[] kk)
   {
      karts = kk.clone();
   }
  
   public void setScore(int ss)
   {
      score = ss;
   }
   
   public void setSpeed(int sss)
   {
      speedMode = sss;
   }
   
   public void setGameMode(String gm)
   {
      gameMode = gm;
   }
   
   public void setDriving(String dd)
   {
      driving = dd;
   }
   
   public String toString()
   {
      String bla = super.toString();
      bla += "The gamemode is " + getGameMode() + " and the current speed mode is " + getSpeedMode() + ". The driving speed is at " + getDriving() + " and the score is " + getScore() + ". The items in the game are: ";
      for (String q: getItems())
      {
         bla+= q + ", ";
      }
      bla += "The karts in the game are: ";
      for (String p: getKarts())
      {
         bla+= p + ", ";
      }
      return bla;
   }
}