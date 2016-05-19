package com.wikia.webdriver.pageobjectsfactory.pageobject.special.galleryboxes;

import com.wikia.webdriver.common.logging.PageObjectLogging;

public class SpecialMostLinkedFilesPage extends GalleryBox {

  public static final String SPECIAL_MOST_LINKED_FILES_PATH = "Special:MostLinkedFiles";

  public SpecialMostLinkedFilesPage open() {
    getUrl(urlBuilder.getUrlForPath(SPECIAL_MOST_LINKED_FILES_PATH));
    PageObjectLogging.log("Special Mos tLinked Files Page",
        SPECIAL_MOST_LINKED_FILES_PATH + " opened", true);

    return this;
  }
}
