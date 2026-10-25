	public static boolean print(String str){
		try{
			System.out.println(str);
			return true;
		} catch (Exception E){
			System.out.println(E);
			return false;
		}
	}

	public static boolean print(int i){
		try{
			System.out.println(i);
			return true;
		} catch (Exception E){
			System.out.println(E);
			return false;
		}
	}


	public static boolean print(char c){
		try{
			System.out.println(c);
			return true;
		} catch (Exception E){
			System.out.println(E);
			return false;
		}
	}

  public static boolean print(boolean b){    
    try{
      System.out.println(b);
      return true;
    } catch (Exception E){
      System.out.println(E);
      return false;
    }
  }
