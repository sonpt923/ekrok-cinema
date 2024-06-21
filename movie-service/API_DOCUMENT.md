# API DOCUMENT (MOVIE SERVICE)

`TABLE OF CONTENT`
<!-- TOC -->
* [API DOCUMENT (MOVIE SERVICE)](#api-document-movie-service)
  * [I, MOVIE](#i-movie)
    * [1, CREATE MOVIE](#1-create-movie)
      * [url: `{{movieUrl}}/public/movie`](#url-movieurlpublicmovie)
      * [method: POST](#method-post)
      * [access type: Bearer](#access-type-bearer)
    * [2, Lấy thông tin theo phim quyền user](#2-lấy-thông-tin-theo-phim-quyền-user)
      * [url: `{{movieUrl}}/public/movie`](#url-movieurlpublicmovie-1)
      * [method: POST](#method-post-1)
      * [access type: Public](#access-type-public)
  * [II People](#ii-people)
<!-- TOC -->

## I, MOVIE

### 1, CREATE MOVIE

#### url: `{{movieUrl}}/create-movie`

#### method: POST

#### access type: Bearer

|     **No**     | **Attribute** | **Value**                 | **Required** | **Description** |
|:--------------:|---------------|---------------------------|--------------|:---------------:|
| **I, Headers** |               |                           |              |     headers     |
|       1        | Content-Type  | application/json          | Yes          |                 |
|       2        | Authorization | Bearer `{{access-token}}` | Yes          |                 |
|  **II, Body**  |               |                           |              |      body       |
|       1        |               |                           |              |                 |
|       2        |               |                           |              |                 |
|       3        |               |                           |              |                 |

**Request Body** `json`

```json

```

**Example**  *Error*

```json

```

**Response Body** `json`

```json
{
  "movie": {
    "id": 2,
    "code": "XI98DL92",
    "name": "Doraemon và sứ sở thần tiên",
    "ageRestriction": 18,
    "duration": 60,
    "poster": "",
    "trailer": "",
    "premiereDate": "2024-08-12",
    "backdrops": [
      {
        "image": "image1.jpg"
      },
      {
        "image": "image2.jpg"
      }
    ],
    "crew": {
      "producer": [
        {
          "code": "92830942",
          "name": "Homelander",
          "profileImage": ""
        }
      ],
      "director": [
        {
          "code": "23820942",
          "name": "Achive",
          "profileImage": ""
        }
      ]
    },
    "genre": [
      {
        "code": "ACTION",
        "name": "action"
      },
      {
        "code": "ACTION",
        "name": "action"
      }
    ]
  }
}
```

### 2, GET MOVIE INFORMATION

#### url: `{{movieUrl}}/public/movie`

#### method: POST

#### access type: Public

| **No**         | **Attribute** | **Value**        | **Required** | **Description** |
|----------------|---------------|------------------|--------------|:----------------|
| **I, Headers** |               |                  |              | headers         |
| 1              | Content-Type  | application/json |              |                 |
| 2              |               |                  |              |                 |
| **II, Body**   |               | body             |              |                 |
| 1              |               |                  |              |                 |
| 2              |               |                  |              |                 |
| 3              |               |                  |              |                 |

**Request Body** `json`

```json

```

**Example**  *Error*

```json

```

**Response Body** `json`

```json
{
  "movie": {
    "code": "XI98DL92",
    "name": "Doraemon và sứ sở thần tiên",
    "ageRestriction": 18,
    "duration": 60,
    "poster": "",
    "trailer": "",
    "premiereDate": "2024-08-12",
    "backdrops": [
      {
        "image": "image1.jpg"
      },
      {
        "image": "image2.jpg"
      }
    ],
    "crew": {
      "producer": [
        {
          "code": "92830942",
          "name": "Homelander",
          "profileImage": ""
        }
      ],
      "director": [
        {
          "code": "23820942",
          "name": "Achive",
          "profileImage": ""
        }
      ]
    },
    "genre": [
      {
        "code": "ACTION",
        "name": "action"
      },
      {
        "code": "ACTION",
        "name": "action"
      },
      {
        "code": "ACTION",
        "name": "action"
      }
    ]
  }
}
```

## II People