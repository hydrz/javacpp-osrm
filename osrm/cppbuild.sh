#!/bin/bash
# This file is meant to be included by the parent cppbuild.sh script
if [[ -z "$PLATFORM" ]]; then
  pushd ..
  bash cppbuild.sh "$@" osrm
  popd
  exit
fi

OSRM_VERSION=5.22.0
download https://github.com/Project-OSRM/osrm-backend/archive/v${OSRM_VERSION}.tar.gz osrm-backend-${OSRM_VERSION}.tar.gz

mkdir -p $PLATFORM
cd $PLATFORM
INSTALL_PATH=$(pwd)

echo "Decompressing archives..."
tar -xzvf ../osrm-backend-${OSRM_VERSION}.tar.gz

cd osrm-backend-${OSRM_VERSION}

mkdir -p build &&
  cd build &&
  BUILD_TYPE="Release" &&
  ENABLE_ASSERTIONS="Off" &&
  BUILD_TOOLS="Off"
$CMAKE -DCMAKE_INSTALL_PREFIX=$INSTALL_PATH -DCMAKE_BUILD_TYPE=${BUILD_TYPE} -DENABLE_ASSERTIONS=${ENABLE_ASSERTIONS} -DBUILD_TOOLS=${BUILD_TOOLS} -DENABLE_LTO=On ..
make install -j $MAKEJ
cd ..

cd ../..
