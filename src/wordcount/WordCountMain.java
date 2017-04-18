package wordcount;

import wordcount.service.WordCountServiceImpl;
import wordcount.service.WordCounterService;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by danawacomputer on 2017-04-13.
 */
public class WordCountMain {
    public static void main(String[] args) {
        List<String> wordList = new ArrayList<>();

        try {
            BufferedReader br = new BufferedReader(
                    new FileReader("src\\closer.txt"));
            String line ="";
            while ((line = br.readLine()) !=null){
                String[] words =line.split("");

                for(String e : words){
                    wordList.add(e);
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        WordCounterService service = new WordCountServiceImpl();
        int count =service.getWordCount(wordList);
        System.out.println(count);
    }
}


/*
            br.readLine();
            List<String> wordcount = new ArrayList();
            String line = "";
            String [] splitLine;

            while((line =br.readLine()) !=null){
                String[] splitLine;
                splitLine = line.split("");
                for(String e : splitLine ){

                    if(e.contains(","))
                        wordcount.add(e.substring(0,e.length()-1));
                    else
                        wordcount.add(e);

                }
            }
            WordCountService t1 = new WordCountService(splitLine[0],splitLine[1], splitLine[2], splitLine[3]);
            list.add(t1);
        }catch (FileNotFoundException fne){
            System.out.println("파일이름이 잘못되었거나 없어요");
        }catch (IOException ie){
            System.out.println("파일을 실제로 IO하다가 에러가 발생했어요");
        }
    }
}

*/
