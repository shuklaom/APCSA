public class VideoGame
{
   private String player;
   private int numPlayers;
   private String background;
   private String nameGame;
   private String[] characters;
   private String[] consoleCompatibility;
   private String typeGame;
   private int memorySpace;
   private int saveSpots;
   private boolean AI;
   private String soundtrack;
   
   
   public VideoGame()
   {
      player = " ";
      numPlayers = 0;
      background = " ";
      nameGame = " ";
      characters = null;
      consoleCompatibility = null;
      typeGame = " ";
      memorySpace = 0;
      saveSpots = 0;
      AI = false;
      soundtrack = " ";    
   }
   
   public VideoGame(String iplayer, int inumPlayers, String ibackground, String inameGame, String[] icharacters, String[] iconsolecompatibility, String itypeGame, int imemorySpace, int isaveSpots, boolean iAI, String isoundtrack)  
   {
      player = iplayer;
      numPlayers = inumPlayers;
      background = ibackground;
      nameGame = inameGame;
      characters = icharacters;
      consoleCompatibility = iconsolecompatibility;
      typeGame = itypeGame;
      memorySpace = imemorySpace;
      saveSpots = isaveSpots;
      AI = iAI;
      background = ibackground;
   }
   
   public void setPlayer(String p)
   {
      player = p;
   }
   public void setNumPlayers(int np)
   {
      numPlayers = np;
   }
   public void setbackground(String b)
   {
      background = b;
   }
   public void setNameGame(String ng)
   {
      nameGame = ng;
   }
   public void setCharacters(String[] c)
   {
      characters = c;
   }
   public void setConsoleCompatibility(String[] cc)
   {
      consoleCompatibility = cc;
   }
   public void setTypeGame(String tg)
   {
      typeGame = tg;
   }
   public void setMemorySpace(int ms)
   {
      memorySpace = ms;
   }
   public void setSaveSpots(int ss)
   {
      saveSpots = ss;  
   }
   public void setAI(boolean a)
   {
      AI = a;
   }
   public void setSoundtrack(String st)
   {
      soundtrack = st;
   }
   public String getPlayer()
   {
      return player;
   }
   public int getNumPlayers()
   {
      return numPlayers;
   }
   public String getBackground()
   {
      return background;
   }
   public String getNameGame()
   {
      return nameGame;
   }
   public String[] getCharacters()
   {
      return characters;
   }
   public String[] getConsoleCompatibility()
   {
      return consoleCompatibility;
   }
   public String getTypeGame()
   {
      return typeGame;
   }
   public int getMemorySpace()
   {
      return memorySpace;
   }
   public int getSaveSpots()
   {
      return saveSpots;
   }
   public boolean getAI()
   {
      return AI;
   }
   public String getsoundtrack()
   {
      return soundtrack; 
   }
   public String toString()
   {
      String a = player + "There are " + numPlayers + " players. The background is " + background + ". The name of the game is " + nameGame + ". The characters are " + printArray(characters) +  ". It's compatible with" + printArray(consoleCompatibility) + ". It's a " + typeGame + "game type. There is "+ memorySpace + " memory space. You have" + saveSpots + " save spots" + AI + "The soundtrack is" + soundtrack; 
      return a;
   }
   public String printArray(String[] print)
   {
      String b = "";
      for (String word: print) {
         b += word;
         b += ", ";
      }
      return b;
   }
}

