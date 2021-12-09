package com.techelevator.controller;

import com.techelevator.dao.CollectionComicDao;
import com.techelevator.dao.XX_ComicDao;
import com.techelevator.model.CollectionComic;
import com.techelevator.model.Comic;
import com.techelevator.model.MarvelComic;
import com.techelevator.services.MarvelComicService;

import org.springframework.context.annotation.Bean;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;



//@PreAuthorize("isAuthenticated()")
@PreAuthorize("permitAll")
@RestController
@CrossOrigin
public class ComicController {

    private CollectionComicDao collectionComicDao;
    private XX_ComicDao comicDao;

    public ComicController() {}

    public ComicController (CollectionComicDao collectionComicDao, XX_ComicDao comicDao ){
        this.collectionComicDao = collectionComicDao;
        this.comicDao = comicDao;
    }

    // String API_BASE_URL = "http://gateway.marvel.com/v1/public/comics?ts=";
    // String privateKey = "197ef818f572516a2966e997ee7268e0cd590e21";
    // String publicKey = "20afbe7ebe8ad8af2c91b02a275e06cc";

    // MarvelComicService marvelComicService = new MarvelComicService(API_BASE_URL, privateKey,publicKey);

    /*@RequestMapping(path = "comic", method = RequestMethod.POST)
    public Boolean createTransfer(@RequestBody CollectionComic collectionComic) {

        MarvelComic comicFromMarvel = marvelComicService.getComic(collectionComic.getComic_id());

        return true;

    }*/




    //Get list of comics in a collection by collectionID **NOT WORKING - NULL POINTER EXCEPTION**
    @RequestMapping(path = "collections/{collectionId}", method = RequestMethod.GET)

    public List<Comic> getAllComicsInCollectionByCollectionId(@PathVariable long collectionId) {

        List<Comic> comics = collectionComicDao.getAllComicsInCollectionByCollectionId(collectionId);

        return comics;
    }

    //Get single comic by id **NOT WORKING - 404**
    @RequestMapping(path = "/comics/{comicId}", method = RequestMethod.GET)
    public Comic getSingleComicById(@PathVariable long comicId) {
        return comicDao.getSingleComicById(comicId);
    }






}
