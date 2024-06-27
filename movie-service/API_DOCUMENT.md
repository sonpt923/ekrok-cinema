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

|     **No**     | **Attribute**  | **Type**         | **Required** |            **Description**            |
|:--------------:|----------------|------------------|--------------|:-------------------------------------:|
| **I, Headers** |                |                  |              |                headers                |
|       1        | Content-Type   | application/json | Yes          |                                       |
|       2        | Authorization  | Bearer           | Yes          |                                       |
|  **II, Body**  |                |                  |              |                 body                  | 
|       1        | Code           | String           | NO           |                                       |
|       2        | title          | String           | Yes          |                                       |   
|       3        | ageRestriction | Integer          | Yes          |                                       |
|       4        | duration       | Integer          | Yes          |                                       |
|       5        | releaseDate    | Integer          | Yes          |                                       |
|     **6**      | genre          | List             | Yes          |             thể loại phim             |
|      6.1       | id             | Long             | Yes          |                                       |   
|      6.2       | code           | String           |              |                                       |
|      6.3       | name           | String           |              |                                       |
|     **7**      | person         | List             | Yes          |      người có chức vụ theo phim       |
|      7.1       | idPerson       | Long             | Yes          |             id của person             |
|      7.2       | role           | String           | Yes          | chức vụ ( ACTOR, DIRECTOR, PRODUCER ) |

**Request Body** `json`

```json
{
  "movie": {
    "code": "",
    "title": "Doraemon và xứ sở thần tiên",
    "ageRestriction": 13,
    "duration": 120,
    "releaseDate": "2024-04-19",
    "genre": [
      {
        "id": 3,
        "code": "ACTION",
        "name": "action"
      },
      {
        "id": 2,
        "code": "ANIME",
        "name": "anime"
      }
    ],
    "person": [
      {
        "idPerson": 1,
        "role": 1
      },
      {
        "idPerson": 2,
        "role": 1
      },
      {
        "idPerson": 1,
        "role": 2
      }
    ]
  }
}
```

**Example**  *Error*

```json

```

**Response Body** `json`

```json
{
  "code": "6a52994d-7150-4333-bcb9-07f1300c0212",
  "status": 200,
  "message": "OK",
  "path": "/movie/public/test",
  "timestamp": "2024-06-25 20:59:06",
  "data": {
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

## II Person