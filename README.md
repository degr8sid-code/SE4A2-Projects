# SE-4A2 OS Projects
This repository consists of projects by SE-4A2 for the Operating Systems Course.

## What is Github Actions

GitHub Actions is a CI/CD tool for the GitHub flow. You can use it to integrate and deploy code changes to a third-party cloud application platform as well as test, track, and manage code changes.

## What is .Net Framework

.Net Framework is a software development platform developed by Microsoft for building and running Windows applications. The .Net framework consists of developer tools, programming languages, and libraries to build desktop and web applications. It is also used to build websites, web services, and games.

### Project Introduction

This is a simple .net project which is written on C#. It checks if the given number is Even or Odd.

### Source Code

    using System;

    namespace DotNetProject
    {
        internal class Program
        {
            static void Main(string[] args)
            {

               Console.WriteLine("Check if number is Even or Odd:\n");
               int num = 10;

               if (num % 2 == 0)
               {
                Console.WriteLine(num + " is an Even number.");
               }
               else
               {
               Console.WriteLine(num + " is an Odd number.");
               }
               
           }
        }
    }


### Github Continuous Intregation

    name: Dot-Net-CI

    on:
      push:
        branches: [ "main" ]
      pull_request:
        branches: [ "main" ]

      workflow_dispatch:

    jobs:
      build:
        runs-on: [windows-latest]

        steps:
          - uses: actions/checkout@v3
      
          - name: setup-msbuild
            uses: microsoft/setup-msbuild@v1.1
        
          - name: setup-nuget 
            uses: NuGet/setup-nuget@v1.0.6  
        
          - name: Build the solution
            run: msbuild DotNetProject.sln
        
          - name: Run the solution
            run: bin/Debug/DotNetProject.exe




