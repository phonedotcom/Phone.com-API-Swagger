/* 
 * Phone.com API
 *
 * This is a Phone.com api Swagger definition
 *
 * OpenAPI spec version: 1.0.0
 * Contact: apisupport@phone.com
 * Generated by: https://github.com/swagger-api/swagger-codegen.git
 */

using System;
using System.IO;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.Reflection;
using RestSharp;
using NUnit.Framework;

using IO.Swagger.Client;
using IO.Swagger.Api;
using IO.Swagger.Model;

namespace IO.Swagger.Test
{
    /// <summary>
    ///  Class for testing MediaApi
    /// </summary>
    /// <remarks>
    /// This file is automatically generated by Swagger Codegen.
    /// Please update the test case below to test the API endpoint.
    /// </remarks>
    [TestFixture]
    public class MediaApiTests
    {
        private MediaApi instance;

        /// <summary>
        /// Setup before each unit test
        /// </summary>
        [SetUp]
        public void Init()
        {
            instance = new MediaApi();
        }

        /// <summary>
        /// Clean up after each unit test
        /// </summary>
        [TearDown]
        public void Cleanup()
        {

        }

        /// <summary>
        /// Test an instance of MediaApi
        /// </summary>
        [Test]
        public void InstanceTest()
        {
            // TODO uncomment below to test 'IsInstanceOfType' MediaApi
            //Assert.IsInstanceOfType(typeof(MediaApi), instance, "instance is a MediaApi");
        }

        
        /// <summary>
        /// Test CreateAccountMedia
        /// </summary>
        [Test]
        public void CreateAccountMediaTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //int? accountId = null;
            //CreateMediaParams data = null;
            //var response = instance.CreateAccountMedia(accountId, data);
            //Assert.IsInstanceOf<MediaFull> (response, "response is MediaFull");
        }
        
        /// <summary>
        /// Test GetAccountMedia
        /// </summary>
        [Test]
        public void GetAccountMediaTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //int? accountId = null;
            //int? recordingId = null;
            //var response = instance.GetAccountMedia(accountId, recordingId);
            //Assert.IsInstanceOf<MediaFull> (response, "response is MediaFull");
        }
        
        /// <summary>
        /// Test ListAccountMedia
        /// </summary>
        [Test]
        public void ListAccountMediaTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //int? accountId = null;
            //List<string> filtersId = null;
            //List<string> filtersName = null;
            //string sortId = null;
            //string sortName = null;
            //int? limit = null;
            //int? offset = null;
            //string fields = null;
            //var response = instance.ListAccountMedia(accountId, filtersId, filtersName, sortId, sortName, limit, offset, fields);
            //Assert.IsInstanceOf<ListMedia> (response, "response is ListMedia");
        }
        
    }

}
