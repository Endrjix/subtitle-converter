package com.dotsub.converter.importer;

import com.dotsub.converter.SubtitleConverterApplicationTests;
import com.dotsub.converter.model.SubtitleItem;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by: Brooks Lyrette
 * For: Dotsub LLC.
 * Date: 16-01-11.
 */
public class SbvImportHandlerTest extends SubtitleConverterApplicationTests {

    @Autowired
    private SubtitleImportHandler sbvImportHandler;

    @Autowired
    private ResourceLoader resourceLoader;

    @Test
    public void testImportTestFile() throws Exception {
        Resource resource = resourceLoader.getResource("classpath:test.sbv");

        List<SubtitleItem> subtitleItemList = sbvImportHandler.importFile(resource.getInputStream());
        assertEquals(21, subtitleItemList.size());
    }

}