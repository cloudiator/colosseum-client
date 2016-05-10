#!/bin/bash

# see https://coderwall.com/p/9b_lfq
# see https://github.com/google/guava/blob/master/util/deploy_snapshot.sh

set -e -u

if [ "$TRAVIS_REPO_SLUG" == "cloudiator/colosseum-client" ] && \
   [ "$TRAVIS_JDK_VERSION" == "oraclejdk7" ] && \
   [ "$TRAVIS_PULL_REQUEST" == "false" ] && \
   [ "$TRAVIS_BRANCH" == "master" ]; then
  echo "Publishing Maven snapshot..."

  mvn clean deploy --settings="util/settings.xml" -DskipTests=true

  echo "Maven snapshot published."

fi
