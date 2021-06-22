package Interfaces;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Zad_6_1_Diary {
    private List<Entry> entries = new ArrayList<>(5);

    private class Entry {
        LocalDate date;
        String text;

        public Entry(LocalDate date, String text) {
            this.date = date;
            this.text = text;
        }
    }

    public void writeEntry(String text) {
        for(int i=0; i<entries.size();i++){
            Entry entry = new Entry(LocalDate.now(),text);
            entries.add(entry);
        }

    }

//    public List<String> getEntriesFrom(LocalDate date) {
//        for(int i=0; i<entries.size();i++){
//            if(entries.contains(date)){
//                return "Wpis"+ entries.get(i).text;
//            }
//    }
    }
