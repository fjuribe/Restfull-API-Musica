package net.furibe.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.furibe.api.entity.Album;
import net.furibe.api.service.IAlbumsService;

@RestController
@RequestMapping("/api")
public class AlbumsController {

	@Autowired
	private IAlbumsService serviceAlbums;
	
	@GetMapping("/albums")
	public List<Album> buscarTodos(){
		 return serviceAlbums.buscartodos();		
	}
	
	@PostMapping("/albums")
	public Album guardar(@RequestBody Album album) {
		serviceAlbums.guardar(album);
		return album;
		
	}
}
