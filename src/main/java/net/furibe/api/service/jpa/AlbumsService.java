package net.furibe.api.service.jpa;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.furibe.api.entity.Album;
import net.furibe.api.repository.AlbumsRepository;
import net.furibe.api.service.IAlbumsService;

@Service
public class AlbumsService implements IAlbumsService{
	
	@Autowired
	private AlbumsRepository repoAlbums;

	@Override
	public List<Album> buscartodos() {
		
		return repoAlbums.findAll();
	}

	@Override
	public void guardar(Album album) {
		repoAlbums.save(album);
		
	}

}
