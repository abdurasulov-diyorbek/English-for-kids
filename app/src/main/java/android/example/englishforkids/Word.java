package android.example.englishforkids;

public class Word{
  private String mDefaultTranslation;
  private String mUzbekTranslation;
  
  public Word(String defaultTranslation, String uzbekTranslation){
    mDefaultTranslation = defaultTranslation;
    mUzbekTranslation = uzbekTranslation;
  }
  
  public String getDefaultTranslation(){
    return mDefaultTranslation;
  }
  
  public String getUzbekTranslation(){
    return mUzbekTranslation;
  }
  
}
