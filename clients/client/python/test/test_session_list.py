"""
    Ory APIs

    Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers.   # noqa: E501

    The version of the OpenAPI document: v0.0.1-alpha.175
    Contact: support@ory.sh
    Generated by: https://openapi-generator.tech
"""


import sys
import unittest

import ory_client
from ory_client.model.session import Session
globals()['Session'] = Session
from ory_client.model.session_list import SessionList


class TestSessionList(unittest.TestCase):
    """SessionList unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def testSessionList(self):
        """Test SessionList"""
        # FIXME: construct object with mandatory attributes with example values
        # model = SessionList()  # noqa: E501
        pass


if __name__ == '__main__':
    unittest.main()
