/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mytunes.gui;

/**
 *
 * @author kacpe
 */

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import mytunes.be.Song;
import mytunes.bll.SongManager;

public class SongModel
{
private ObservableList<Song> allSongs;
private SongManager songManager;

public SongModel() throws Exception 
    {
        songManager = new SongManager();
        allSongs = FXCollections.observableArrayList();
        allSongs.addAll(songManager.getAllSongs());
    }

    public ObservableList<Song> getAllSongs()
    {
        return allSongs;
    }
    
}