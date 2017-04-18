package wordcount.service;

import java.util.List;

/**
 * Created by danawacomputer on 2017-04-13.
 */
public class WordCountServiceImpl implements WordCounterService {

    public int getWordCount(List<String> list){

        int count =0;
        for(String e : list) {
            if(!e.equals("")){
                count++;
            }
        }
        return count++;
        //TODO
    }
}
