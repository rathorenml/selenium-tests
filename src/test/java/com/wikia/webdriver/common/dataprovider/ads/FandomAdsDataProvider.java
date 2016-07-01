package com.wikia.webdriver.common.dataprovider.ads;

import com.wikia.webdriver.common.templates.fandom.AdsFandomTestTemplate;

import org.testng.annotations.DataProvider;

public class FandomAdsDataProvider {

  private FandomAdsDataProvider() {

  }

  @DataProvider
  public static Object[][] fandomAdsPage() {
    return new Object[][]{
        {"young-fans-guide-cinema-part-3"}
    };
  }

  @DataProvider
  public static Object[][] fandomAdsHub() {
    return new Object[][]{
        {"games"}
    };
  }

  @DataProvider
  public static Object[][] fandomBtfBlockPage() {
    return new Object[][]{
        {"game-of-thrones-the-ghost-of-high-heart"}
    };
  }

  @DataProvider
  public static Object[][] fandomUapPage() {
    return new Object[][]{
        {
            AdsFandomTestTemplate.PAGE_TYPE_ARTICLE,
            "box-office-audiences-download-angry-birds",
            291751932,
            291759372
        },
        {
            AdsFandomTestTemplate.PAGE_TYPE_HUB,
            "tv",
            291751932,
            291759372
        }
    };
  }
}
