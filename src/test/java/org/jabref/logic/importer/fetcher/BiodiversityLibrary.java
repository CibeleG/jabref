package org.jabref.logic.importer.fetcher;

import org.jabref.testutils.category.FetcherTest;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

@FetcherTest
class BiodiversityLibraryTest {

    private BiodiversityLibrary finder;
    private String url;
    private String fakeUrl;

    @BeforeEach
    void setUp() {
        finder = new BiodiversityLibrary();
        this.url = "https://www.biodiversitylibrary.org/api3?op=GetCollections&format=json&apikey=";
        this.fakeUrl = "https://fake-url.com/fake.json";
    }

    @Test
    void getFetchDataShouldReturnJsonWithDataTest() throws Exception {
        fail();
    }

    @Test
    void getFetchDataShouldThrowExceptionTest() throws Exception {
        fail();
    }

    @Test
    void getCollectionsShouldReturnObjWithDataTest() throws Exception {
        fail();
    }

    @Test
    void getAuthorsShouldReturnObjWithMetadataTest() throws Exception {
        fail();
    }

    @Test
    void getAuthorsShouldThrowExceptionTest() throws Exception {
       fail();
    }

    @Test
    void getSubjectMetadataShouldReturnObjWithMetadataTest() throws Exception {
       fail();

    @Test
    void getSubjectMetadataShouldThrowExceptionTest() throws Exception {
        fail();
    }

    @Test
    void publicationSearchShouldReturnObjWithMetadataTest() throws Exception {
        fail();
    }

    @Test
    void publicationSearchShouldThrowExceptionTest() throws Exception {
        fail();
    }

    @Test
    void authorSearchShouldReturnObjWithMetadataTest() throws Exception {
        fail();
    }

}