#!/bin/bash
lein clean
lein cljsbuild once production
lein s3-static-deploy