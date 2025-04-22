#!/bin/sh
echo "Configuring Git hooks..."
git config core.hooksPath .githooks
chmod +x .githooks/pre-push
chmod +x .githooks/pre-commit
echo "Hooks configured!"