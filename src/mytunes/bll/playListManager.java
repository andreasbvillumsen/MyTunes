/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mytunes.bll;

import java.util.List;
import mytunes.be.Playlist;
import mytunes.dal.PlaylistFacade;
import mytunes.dal.database.PlaylistDBDAO;

/**
 *
 * @author anton
 */
public class playListManager {
    
private PlaylistFacade pD;

 public playListManager() throws Exception 
    {
       pD = new PlaylistDBDAO();

    }
 
 public List<Playlist> getAllPlaylists()
     {
        return pD.getAllPlaylists();
     }
 
 public void createPlaylist(Playlist playlistToAdd)
    {
        pD.createPlaylist(playlistToAdd);
    }
}