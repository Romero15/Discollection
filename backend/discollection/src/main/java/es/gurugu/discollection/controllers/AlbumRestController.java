package es.gurugu.discollection.controllers;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import es.gurugu.discollection.models.services.IAlbumService;
import es.gurugu.discollection.models.entity.Album;

@CrossOrigin(origins = {"http://localhost:4200"})
@RestController
@RequestMapping("/api/album")
public class AlbumRestController {
	
	private static Logger LOGGER = LogManager.getLogger(AlbumRestController.class);
	
	@Autowired
	private IAlbumService albumService;
	
	@GetMapping("/lista")
	public List <Album> listado(){
		LOGGER.info("Obteniendo listado de albums");
		return albumService.findAll();
	}
	
	@GetMapping("/{id}")
	public Album show(@PathVariable Long id) {
		LOGGER.info("Get Album  >> find by id="+id);
		return albumService.findById(id);
	}
	
	@PostMapping("/add")
	@ResponseStatus(HttpStatus.CREATED)
	public Album create(@RequestBody Album album) {
		LOGGER.info("Add album  >> save");
		return albumService.save(album);
	}
	
	@PutMapping("/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public Album update(@RequestBody Album album, @PathVariable Long id) {
		LOGGER.info("Update album  >> find by id + save");
		Album albumActual = albumService.findById(id);
		LOGGER.info("Modificando albúm con id: "+id);		
		albumActual.setTitulo(album.getTitulo());
		albumActual.setSello(album.getSello());
		albumActual.setReferencia(album.getReferencia());
		albumActual.setArtista(album.getArtista());
		albumActual.setUpdateAt(new Date());
		albumActual.setLanzamiento(album.getLanzamiento());
		
		return albumService.save(albumActual);		
	}
	
	@DeleteMapping("/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		LOGGER.info("Delete album  >> delete by id= "+ id);
		albumService.delete(id);
	}
	
	

}
 