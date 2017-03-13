# coding: utf-8

"""
    Phone.com API

    This is a Phone.com api Swagger definition

    OpenAPI spec version: 1.0.0
    Contact: apisupport@phone.com
    Generated by: https://github.com/swagger-api/swagger-codegen.git
"""


from pprint import pformat
from six import iteritems
import re


class RuleSetFilter(object):
    """
    NOTE: This class is auto generated by the swagger code generator program.
    Do not edit the class manually.
    """
    def __init__(self, type=None, schedule=None, contact=None, group=None):
        """
        RuleSetFilter - a model defined in Swagger

        :param dict swaggerTypes: The key is attribute name
                                  and the value is attribute type.
        :param dict attributeMap: The key is attribute name
                                  and the value is json key in definition.
        """
        self.swagger_types = {
            'type': 'str',
            'schedule': 'ScheduleSummary',
            'contact': 'ContactSummary',
            'group': 'GroupSummary'
        }

        self.attribute_map = {
            'type': 'type',
            'schedule': 'schedule',
            'contact': 'contact',
            'group': 'group'
        }

        self._type = type
        self._schedule = schedule
        self._contact = contact
        self._group = group

    @property
    def type(self):
        """
        Gets the type of this RuleSetFilter.
        Required.

        :return: The type of this RuleSetFilter.
        :rtype: str
        """
        return self._type

    @type.setter
    def type(self, type):
        """
        Sets the type of this RuleSetFilter.
        Required.

        :param type: The type of this RuleSetFilter.
        :type: str
        """
        if type is not None and not re.search('schedule|contact|contact_group', type):
            raise ValueError("Invalid value for `type`, must be a follow pattern or equal to `/schedule|contact|contact_group/`")

        self._type = type

    @property
    def schedule(self):
        """
        Gets the schedule of this RuleSetFilter.
        Schedule that this filter refers to. Output is a Schedule Summary Object. Input must be a Schedule Lookup Object. Required.

        :return: The schedule of this RuleSetFilter.
        :rtype: ScheduleSummary
        """
        return self._schedule

    @schedule.setter
    def schedule(self, schedule):
        """
        Sets the schedule of this RuleSetFilter.
        Schedule that this filter refers to. Output is a Schedule Summary Object. Input must be a Schedule Lookup Object. Required.

        :param schedule: The schedule of this RuleSetFilter.
        :type: ScheduleSummary
        """

        self._schedule = schedule

    @property
    def contact(self):
        """
        Gets the contact of this RuleSetFilter.
        Address Book Contact that this filter refers to. Output is a Contact Summary Object. Input must be a Contact Lookup Object. Required.

        :return: The contact of this RuleSetFilter.
        :rtype: ContactSummary
        """
        return self._contact

    @contact.setter
    def contact(self, contact):
        """
        Sets the contact of this RuleSetFilter.
        Address Book Contact that this filter refers to. Output is a Contact Summary Object. Input must be a Contact Lookup Object. Required.

        :param contact: The contact of this RuleSetFilter.
        :type: ContactSummary
        """

        self._contact = contact

    @property
    def group(self):
        """
        Gets the group of this RuleSetFilter.
        Address Book Group that this filter refers to. Output is a Contact Group Summary Object. Input must be a Contact Group Lookup Object. Required.

        :return: The group of this RuleSetFilter.
        :rtype: GroupSummary
        """
        return self._group

    @group.setter
    def group(self, group):
        """
        Sets the group of this RuleSetFilter.
        Address Book Group that this filter refers to. Output is a Contact Group Summary Object. Input must be a Contact Group Lookup Object. Required.

        :param group: The group of this RuleSetFilter.
        :type: GroupSummary
        """

        self._group = group

    def to_dict(self):
        """
        Returns the model properties as a dict
        """
        result = {}

        for attr, _ in iteritems(self.swagger_types):
            value = getattr(self, attr)
            if isinstance(value, list):
                result[attr] = list(map(
                    lambda x: x.to_dict() if hasattr(x, "to_dict") else x,
                    value
                ))
            elif hasattr(value, "to_dict"):
                result[attr] = value.to_dict()
            elif isinstance(value, dict):
                result[attr] = dict(map(
                    lambda item: (item[0], item[1].to_dict())
                    if hasattr(item[1], "to_dict") else item,
                    value.items()
                ))
            else:
                result[attr] = value

        return result

    def to_str(self):
        """
        Returns the string representation of the model
        """
        return pformat(self.to_dict())

    def __repr__(self):
        """
        For `print` and `pprint`
        """
        return self.to_str()

    def __eq__(self, other):
        """
        Returns true if both objects are equal
        """
        if not isinstance(other, RuleSetFilter):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """
        Returns true if both objects are not equal
        """
        return not self == other